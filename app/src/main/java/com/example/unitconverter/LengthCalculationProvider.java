package com.example.unitconverter;


public class LengthCalculationProvider {


    //Meter to conversion
    public static double mToCm(double meter){
        return meter * 100;
    }
    public static double mToMm(double meter){ return meter / 0.0010000; }
    public static double mToKm(double meter){
        return meter / 1000;
    }
    public static double mToFeet(double meter){ return meter * 3.2808; }
    public static double mToInch(double meter){ return meter * 39.370; }
    public static double mToMile(double meter){ return meter * 0.00062137; }

    //Centimeter to conversion
    public static double cmToM(double centimeter){
        return centimeter / 100;
    }
    public static double cmToMm(double centimeter){ return centimeter / 0.1; }
    public static double cmToKm(double centimeter){ return centimeter / 100000; }
    public static double cmToFeet(double centimeter){ return centimeter * 0.032808; }
    public static double cmToInch(double centimeter){ return centimeter * 0.39370; }
    public static double cmToMile(double centimeter){ return centimeter /  160934.4; }

    //Millimeter to conversion
    public static double mmToM(double millimeter){
        return millimeter / 1000;
    }
    public static double mmToCm(double millimeter){ return millimeter / 10; }
    public static double mmToKm(double millimeter){ return millimeter / 1000000; }
    public static double mmToFeet(double millimeter){ return millimeter * 0.0032808; }
    public static double mmToInch(double millimeter){ return millimeter  * 0.039370; }
    public static double mmToMile(double millimeter){ return millimeter * 0.00000062137; }


    //Inch to conversion
    public static double inchToM(double inch){ return inch / 39.370; }
    public static double inchToCm(double inch){ return inch / 0.39370; }
    public static double inchToMm(double inch){ return inch / 0.039370; }
    public static double inchToFeet(double inch){ return inch *  0.083333; }
    public static double inchToMile(double inch){ return inch  * 0.000015783;}
    public static double inchToKm(double inch){ return inch / 39370; }

    //KiloMeter to conversion
    public static double kmToM(double kilometer){
        return kilometer / 0.001;
    }
    public static double kmToCm(double kilometer){ return kilometer * 100000; }
    public static double kmToMm(double kilometer){ return kilometer / 0.000001; }
    public static double kmToFeet(double kilometer){ return kilometer * 3280.8; }
    public static double kmToInch(double kilometer){ return kilometer  * 39370.07874;}
    public static double kmToMile(double kilometer){ return kilometer * 0.62137; }


    //Feet to conversion
    public static double feetToM(double feet){
        return feet / 3.2808;
    }
    public static double feetToCm(double feet){ return feet / 0.032808; }
    public static double feetToMm(double feet){ return feet / 0.0032808; }
    public static double feetToKm(double feet){ return feet / 3280.8; }
    public static double feetToInch(double feet){ return feet  * 12;}
    public static double feetToMile(double feet){ return feet * 0.000189; }


    //Mile to conversion
    public static double mileToM(double mile){
        return mile / 0.00062137;
    }
    public static double mileToCm(double mile){ return mile * 160934 ; }
    public static double mileToMm(double mile){ return mile * 1609344; }
    public static double mileToKm(double mile){ return mile / 0.62137; }
    public static double mileToInch(double mile){ return mile  * 63360;}
    public static double mileToFeet(double mile){ return mile * 5280.0; }



}
