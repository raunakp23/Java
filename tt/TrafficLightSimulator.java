public class TrafficLightSimulator {
    
        public static void main(String[] args) {
            String currentState = "Red";
            
            System.out.println("Traffic Light Simulator");
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Current state: " + currentState);
                
                switch (currentState) {
                    case "Red":
                        System.out.println("Stop!");
                        try {
                            Thread.sleep(2000); // Red light for 2 seconds
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        currentState = "Green";
                        break;
                    case "Green":
                        System.out.println("Go!");
                        try {
                            Thread.sleep(2000); // Green light for 2 seconds
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        currentState = "Yellow";
                        break;
                    case "Yellow":
                        System.out.println("Prepare to stop.");
                        try {
                            Thread.sleep(1000); // Yellow light for 1 second
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        currentState = "Red";
                        break;
                }
            }
        }
    }
    
    







