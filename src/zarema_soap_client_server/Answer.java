package zarema_soap_client_server;

import java.io.Serializable;

public class Answer implements Serializable {

    private double y;

    public Answer() {
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("\nОтвет: y = %.3f", y);
    }

}
