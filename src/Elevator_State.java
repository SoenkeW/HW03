public class Elevator_State {
    public final String STATE_MOVING_UP = "Moving Up";
    public final String STATE_MOVING_DOWN = "Moving Down";
    public final String STATE_ARRIVE_TO_FLOOR = "Arrive to Floor";
    public final String STATE_IDLE = "Idle";
    public final String STATE_EXIT = "exit";

    public final String STATE_ARRIVED = "Arrived to Destination!";
    public String currentState = STATE_IDLE;
    int currentFloor = 0;

    public Elevator_State(int startFloor) {
        currentFloor = startFloor;
    }

    public void idle(int destination_floor) {
        while (currentFloor < destination_floor) {
            //State.current_State = State.moving_up
            currentState = STATE_MOVING_UP;
            printState();
            currentFloor++;
        }//while moving up

        while (currentFloor > destination_floor) {
            //State.current_State = State.moving_up
            currentState = STATE_MOVING_DOWN;
            printState();
            currentFloor--;
        }//while moving down

        if (currentFloor == destination_floor) {
            //State.current_State= State.Arrive_to_Floor
            currentState = STATE_ARRIVE_TO_FLOOR;
            printState();
        }
    }

    private void printState() {
        System.out.println(String.format("state: '%s' floor: %d", currentState, currentFloor));
    }

    public void exit() {
        //State.current_State= State.arrived
        currentState = STATE_EXIT;
    }


}
