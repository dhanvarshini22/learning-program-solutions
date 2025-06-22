public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Remote control setup
        RemoteControl remote = new RemoteControl();

        System.out.println("--- Pressing ON button ---");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("--- Pressing OFF button ---");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
