public class Elevator_State
{
    public String moving_up ="Moving Up";
    public String moving_down = "Moving Down";
    public String arrive_to_floor = "Arrive to Floor";
    public String idle= "Idle";
    public static String current_State;
    public String arrived= "Arrived to Destination!";




    public static void idle(int current_floor, int destination_floor){
        if(current_floor == destination_floor){
            //State.current_State= State.Arrive_to_Floor
            current_State= "Arrive_to_Floor";
            System.out.println(current_State);
            exit();
        }
        while(current_floor<destination_floor){
            //State.current_State = State.moving_up
           current_State= "moving_up";
            System.out.println(current_State);
           current_floor++;
        }


        while(current_floor>destination_floor){
            //State.current_State = State.moving_up
            current_State= "moving_down";
            System.out.println(current_State);
            current_floor--;
        }
        exit();

    }
    public static void exit(){
        //State.current_State= State.arrived
        current_State= "Exit";
    }



}
