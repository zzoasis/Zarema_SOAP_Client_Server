package zarema_soap_client_server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)

public class CommunicationWithClient implements ICommunicationWithClient {

    @Override
    public Answer solution(double a, double b, double x) {
        double y;
        try {
            System.out.println("Значения переменных:\na = " + a + "\nb = " + b + "\nx = " + x);
            if (x >= 8) {
                y = ((a * a) + (4*x*x)+b)/ (2*x);
            } else {
                y = ((a * a) - (2*x*x));
            }
            if ((Double.isNaN(y)) || Double.isInfinite(y)) {
                return null;
            } else {
                Answer result = new Answer();
                result.setY(y);
                return result;
            }
        } catch (Exception e) {
            return null;
        }
    }

}
