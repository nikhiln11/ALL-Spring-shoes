class DBSStudent {
    int stuId;
    String stuName;
    int marks;
    
    private static DBSStudent dbsStudent = null;
    
    private DBSStudent(int stuId, String stuName, int marks) {
        super();
        this.stuId = stuId;
        this.stuName = stuName;
        this.marks = marks;
    }
    
    public static  DBSStudent getInstance(int stuId, String stuName, int marks){
        
        if(dbsStudent == null) {
            dbsStudent = new DBSStudent(stuId, stuName, marks);
        }
        
        return dbsStudent;
        
    }
    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks=" + marks + "]";
    }
    
    
}

public class demo {
    public static void main(String[] args) {
    
        
        DBSStudent stu1 = DBSStudent.getInstance(123,"Hari",88);
        DBSStudent stu2 = DBSStudent.getInstance(123,"Hari",88);
        DBSStudent stu3 = DBSStudent.getInstance(123,"Hari",88);
        DBSStudent stu4 = DBSStudent.getInstance(123,"Hari",88);
        
        if(stu1 == stu4)  System.out.println(" Both are same....");
        else System.out.println(" Both are not equal....");
        
        
        
        
        
    }
}
