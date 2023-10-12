public class ClientStud {
    public static void main(String[] args) {
       // Student.StudentBuilder studBuilder=new Student.StudentBuilder();
       // studBuilder.setAge(20);
       // studBuilder.setBatch("October 2023 Morning Night ");
       // studBuilder.setName("~~~ DRAC ~~~");
       // studBuilder.setYear(2023);
       // try{
       //     Student studObj=studBuilder.build();
       //     studObj.printParam();
       // }catch(Exception exception) {

       //     System.out.println(exception);
       // }
                    // method 2
        try {
            Student stud= new Student.StudentBuilder().setName("goutham").setBatch("Oct").setAge(20).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
