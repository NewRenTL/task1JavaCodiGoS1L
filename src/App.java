

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Student: Diego Orlando Bustamante Palomino");
        System.out.println("---------------------------------");
        System.out.println("Area of a circle");
        float PI = 3.14f;
        float radio = 11f;
        float area = PI * (radio*radio);
        System.out.println("The area of a circle with radio is "+radio+" and PI is "+PI+" is equal to "+area);
        System.out.println("\n");

        
        System.out.println("---------------------------------");
        System.out.println("Conversion of temperature from Celsius to Fahrenheit");
        
        float C = 32f;
        float F = ((float)9/5)*C +32f;

        System.out.println("The degrees Celsius is "+C +" and Fahrenheit degrees is "+F);
        System.out.println("\n");
        System.out.println("---------------------------------");



        System.out.println("The volume of a sphere");
        radio = 15f;
        float sphere_volume = ((float)4/3) * PI * (radio*radio*radio);
        System.out.println("The sphere has a radio of "+radio+" so its volume is "+sphere_volume);
        System.out.println("\n");
        System.out.println("---------------------------------");



        System.out.println("Mathematical Operations");  
        float num1 = 5;
        float num2 = 8;
        //Addition or Sum
        float addition = num1 + num2;
        float substraction = num1-num2;
        float multiplication = num1 * num2;
        float division = (float)num1/num2;
        System.out.println("My float numbers are five(5) and eight(8) ,so the results of my operations are :");
        System.out.println("The sum is : "+addition);
        System.out.println("The substraction is : "+substraction);
        System.out.println("The multiplication is : "+multiplication);
        System.out.println("The division is : "+ division);
        
        System.out.println("---------------------------------");
        System.out.println("Currency Conversion");
        System.out.println("Dolar to Euro:");
        float amount_of_dollars = 312f;
        float Dolar_to_Euro_exchage_over = 0.91f;
        float result_Dolar_to_Euro = amount_of_dollars*Dolar_to_Euro_exchage_over;
        System.out.println("My dollar amount is "+amount_of_dollars + " but the change from dollars to euros is "+result_Dolar_to_Euro);
        System.out.println("\n");
        System.out.println("Euro to Dollar:");
        System.out.println("If I invest the operation from euros to dollars, so I need to divide\nthe amount of euros by the exchange rate of dollars\n");
        float amount_Euros = (float)result_Dolar_to_Euro;
        float Euro_to_Dollar_exchange_over = 1.10f;
        float result_Euro_to_Dollar = amount_Euros * Euro_to_Dollar_exchange_over;
        System.out.println("My amount of euros is "+ amount_Euros + " but the change from euros to dollars is "+ result_Euro_to_Dollar);
    }
}
