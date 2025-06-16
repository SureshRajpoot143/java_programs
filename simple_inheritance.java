public class Inheritance {
    class Student {
        protected int rollNo, mark;
        String name;
        
        protected void input() {
            System.out.println("Enter your roll_no and marks");
        }
    }

    class B extends Student {
        void disp() { 
            rollNo = 1; 
            name = "ssr";
            mark = 57;  
            System.out.println(rollNo + "" + name + "" + mark);
        }
    }

    public static void main(String[] args) {
        B ref = new B(); 
        ref.input();
        ref.disp();
    }
}
