package day40;

public class SpaceShip {

    String name;
    String currentDirection;
    int x;
    int y;


    public void setInitialPosition(int newX, int newY) {
        x = newX;
        y = newY;
    }


    public void setDirection(String newDirection) {
        if (    newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("left") ||
                newDirection.equalsIgnoreCase("right"))  {
                currentDirection = newDirection;
        }else {
            System.out.println("Invalid Direction");
            currentDirection = "";
        }
    }

    public void move1Block() {
        switch (currentDirection) {
            case "right" :
                x++;
                break;
            case "left" :
                x--;
                break;
            case "up" :
                y++;
                break;
            case "down" :
                y--;
                break;
            default:
                break;
        }
    }

    // add a functionality to move1Block with direction provided in one shot
    public void move1Block(String newDirection) {
        setDirection(newDirection);
        move1Block();
    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


}
