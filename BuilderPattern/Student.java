public class Student {
    private String name;
    private int age;
    private int psp;
    //Optional Parameters.
    private String batch;
    private int year;

    private Student(StudentBuilder student){
        this.name=student.name;
        this.age=student.age;
        this.psp=student.psp;
        this.batch=student.batch;
        this.year=student.year;
        try {
            validate();
        } catch (Exception e) {
            // handle the exception here
            throw  new IllegalArgumentException(e.getMessage());
        }

    }
        public static class StudentBuilder{
            private String name;
            private int age;
            private int psp=00;
            //Optional Parameters.
            private String batch;
            private int year=2023;

            Student build() {
                return new Student(this);
            }

            public StudentBuilder setName(String name1){
                this.name=name1;
                return this;
            }
            public StudentBuilder setAge(int age1){
                this.age=age1;
                return this;
            }
            public StudentBuilder setPsp(int psp1){
                this.psp=psp1;
                return this;
            }
            public StudentBuilder setBatch(String batch1){
                this.batch=batch1;
                return this;
            }
            public StudentBuilder setYear(int year1){
                this.year=year1;
                return this;
            }

        }

        public void printParam(){
            System.out.println("Name="+name+" | Age="+age+" | Psp="+psp+" | Batch="+batch+" | Year="+year);
        }

    private void validate() throws Exception {
        if (this.year > 2022) {
            throw new IllegalArgumentException("Grad year is invalid");
        }
        if (this.age > 90 || this.age < 10) {
            throw new IllegalArgumentException("Not valid age.");
        }
    }
}
