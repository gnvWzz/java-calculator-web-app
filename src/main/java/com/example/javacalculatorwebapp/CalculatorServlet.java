package com.example.javacalculatorwebapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/simple-calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        PrintWriter writer = response.getWriter();
        try {
            double result = Calculator.calculate(firstOperand,secondOperand,operator);
            writer.println("<html>");

            writer.println("<h1>Result:</h1><br>");
            writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);

            writer.println("</html>");
        } catch (Exception e) {
            writer.println("Invalid division.");
        }
    }
}
