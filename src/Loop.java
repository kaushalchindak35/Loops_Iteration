/*Create a Pojo with 5 attributes. Some with type as String and some as int and one as double.
        In your main method create 4 objects of the pojo and set random values. Compare the attribute
        values for each of the objects and print the results.
        Scenario should include one attribute with same values in 3 objects. Int value same in 2 objects.
        Comparison should be with all attributes of the same types.
    o/p:-    3 cars have same number of doors.
             2 cars have same color.*/
public class Loop {
    public static void main(String[] args) {
        CarPojo c1=new CarPojo();
        CarPojo c2=new CarPojo();
        CarPojo c3=new CarPojo();
        CarPojo c4=new CarPojo();
        c1.setNumberOfDoors(4);
        c2.setNumberOfDoors(4);
        c3.setNumberOfDoors(5);
        c4.setNumberOfDoors(4);
        c1.setColor("yellow");
        c2.setColor("White");
        c3.setColor("yellow");
        c4.setColor("red");
        if(c1.getNumberOfDoors()==c2.getNumberOfDoors())
        {
            if(c2.getNumberOfDoors()==c3.getNumberOfDoors())
            {
                System.out.println("3 cars have same number of doors");
            }
            else if(c1.getNumberOfDoors()==c4.getNumberOfDoors())
            {
                System.out.println("3 cars have same number of doors");
            }
        }
        else if (c2.getNumberOfDoors()==c3.getNumberOfDoors())
        {
            if (c2.getNumberOfDoors() == c4.getNumberOfDoors())
            {
                System.out.println("3 cars have same number of doors");
            }
            else
            {
                System.out.println("Not a Match");
            }
        }
        else
        {
            System.out.println("Not match");
        }

        if(c1.getColor()==c2.getColor()||c1.getColor()== c3.getColor()||c1.getColor()==c4.getColor())
        {
            System.out.println("2 Cars have same color");
        }
        else if(c2.getColor()== c3.getColor()||c2.getColor()== c4.getColor())
        {
            System.out.println("2 cars have same color");
        }
        else if(c3.getColor()==c4.getColor())
        {
            System.out.println("2 cars have same color");
        }
        else
        {
            System.out.println("not match");
        }

}

}
class CarPojo{
   private int numberOfDoors;
   private  String color;
   private int length;
   private float avg;
   private String maker;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
