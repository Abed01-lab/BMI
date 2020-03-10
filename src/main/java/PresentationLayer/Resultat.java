package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Resultat extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        Double height = Double.parseDouble(request.getParameter("height"));
        Double weight = Double.parseDouble(request.getParameter("weight"));

        Double bmi = (weight / ((height/100) * (height/100)));
        System.out.println(bmi);

        request.setAttribute("height", Double.toString(height));
        request.setAttribute("weight", Double.toString(weight));
        request.setAttribute("bmi", Double.toString(bmi));

        return "resultat";
    }
}
