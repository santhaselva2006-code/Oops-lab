import java.util.*;
import java.text.DecimalFormat;

class CurrencyConvertor {
    double rupee, dollar, euro, yen;
    Scanner sc;
    DecimalFormat f = new DecimalFormat("##.###");

    CurrencyConvertor(Scanner sc) {
        this.sc = sc;
    }

    public void convertInrToEuro() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        euro = rupee / 80;
        System.out.println("Euro: " + f.format(euro));
    }

    public void convertEuroToInr() {
        System.out.println("Enter amount in Euro:");
        euro = sc.nextDouble();
        rupee = euro * 80;
        System.out.println("Rupees: " + f.format(rupee));
    }

    public void convertInrToDollar() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        dollar = rupee / 66;
        System.out.println("Dollar: " + f.format(dollar));
    }

    public void convertDollarToInr() {
        System.out.println("Enter amount in Dollar:");
        dollar = sc.nextDouble();
        rupee = dollar * 66;
        System.out.println("Rupees: " + f.format(rupee));
    }

    public void convertInrToYen() {
        System.out.println("Enter amount in rupees:");
        rupee = sc.nextDouble();
        yen = rupee / 0.61;
        System.out.println("Yen: " + f.format(yen));
    }

    public void convertYenToInr() {
        System.out.println("Enter amount in Yen:");
        yen = sc.nextDouble();
        rupee = yen * 0.61;
        System.out.println("Rupees: " + f.format(rupee));
    }
}


class DistanceConvertor {
    double meter, km, miles;
    Scanner sc;
    DecimalFormat f = new DecimalFormat("##.###");

    DistanceConvertor(Scanner sc) {
        this.sc = sc;
    }

    public void convertMeterToKm() {
        System.out.println("Enter the meter:");
        meter = sc.nextDouble();
        km = meter * 0.001;
        System.out.println("Kilometer: " + f.format(km));
    }

    public void convertKmToMeter() {
        System.out.println("Enter the kilometer:");
        km = sc.nextDouble();
        meter = km / 0.001;
        System.out.println("Meter: " + f.format(meter));
    }

    public void convertMilesToKm() {
        System.out.println("Enter the miles:");
        miles = sc.nextDouble();
        km = miles * 1.6093;
        System.out.println("Kilometer: " + f.format(km));
    }

    public void convertKmToMiles() {
        System.out.println("Enter the kilometer:");
        km = sc.nextDouble();
        miles = km / 1.6093;
        System.out.println("Miles: " + f.format(miles));
    }
}


class TimeConvertor {
    double hour, minute, second;
    Scanner sc;
    DecimalFormat f = new DecimalFormat("##.###");

    TimeConvertor(Scanner sc) {
        this.sc = sc;
    }

    public void convertHourToMinute() {
        System.out.println("Enter the hour:");
        hour = sc.nextDouble();
        minute = hour * 60;
        System.out.println("Minutes: " + f.format(minute));
    }

    public void convertMinuteToHour() {
        System.out.println("Enter the minute:");
        minute = sc.nextDouble();
        hour = minute / 60;
        System.out.println("Hours: " + f.format(hour));
    }

    public void convertHourToSeconds() {
        System.out.println("Enter the hour:");
        hour = sc.nextDouble();
        second = hour * 3600;
        System.out.println("Seconds: " + f.format(second));
    }

    public void convertSecondsToHour() {
        System.out.println("Enter the seconds:");
        second = sc.nextDouble();
        hour = second / 3600;
        System.out.println("Hours: " + f.format(hour));
    }
}


public class Convertor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor currency = new CurrencyConvertor(sc);
        DistanceConvertor distance = new DistanceConvertor(sc);
        TimeConvertor time = new TimeConvertor(sc);

        int code, currency_code, distance_code, time_code;

        System.out.println("Enter the code:");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time");

        code = sc.nextInt();

        if (code == 1) {

            System.out.println("Enter the Currency code:");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen");

            currency_code = sc.nextInt();

            if (currency_code == 1) {
                currency.convertInrToEuro();
                currency.convertEuroToInr();
            }
            else if (currency_code == 2) {
                currency.convertInrToDollar();
                currency.convertDollarToInr();
            }
            else if (currency_code == 3) {
                currency.convertInrToYen();
                currency.convertYenToInr();
            }
            else {
                System.out.println("Invalid Currency Code");
            }
        }

        else if (code == 2) {

            System.out.println("Enter the Distance code:");
            System.out.println("1: Meter");
            System.out.println("2: Miles");

            distance_code = sc.nextInt();

            if (distance_code == 1) {
                distance.convertMeterToKm();
                distance.convertKmToMeter();
            }
            else if (distance_code == 2) {
                distance.convertMilesToKm();
                distance.convertKmToMiles();
            }
            else {
                System.out.println("Invalid Distance Code");
            }
        }

        else if (code == 3) {

            System.out.println("Enter the Time code:");
            System.out.println("1: Minutes");
            System.out.println("2: Seconds");

            time_code = sc.nextInt();

            if (time_code == 1) {
                time.convertHourToMinute();
                time.convertMinuteToHour();
            }
            else if (time_code == 2) {
                time.convertHourToSeconds();
                time.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid Time Code");
            }
        }

        else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}