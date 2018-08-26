package Delegate;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    //Delegatet method
    public void back(int v) {
        controls.back(v);
    }

    public void down(int v) {
        controls.down(v);
    }

    public void forward(int v) {
        controls.forward(v);
    }

    public void left(int v) {
        controls.left(v);
    }

    public void right(int v) {
        controls.right(v);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void up(int v) {
        controls.up(v);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA");
        protector.forward(100);
    }
}
