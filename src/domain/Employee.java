package domain;

/**
 * Класс, представляющий сотрудника
 * @author Jekaprio
 */
public class Employee {
    
    /**
     * Отображает информацию о сотруднике
     * @return строка с информацией о сотруднике
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * Конструктор с параметрами
     * @param name имя сотрудника
     * @param jobTitle должность сотрудника
     * @param level уровень сотрудника
     * @param dept отдел сотрудника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    
    /**
     * Конструктор
     * Инициализировать идентификатор сотрудника как целое число от 1 до 1000
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    
    /**
     * Метод, определяющий должность сотрудника
     * @param job название работы
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    
    /**
     * Метод получения должности сотрудника
     * @return название работы
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    /**
     * Метод, который получает имя сотрудника
     * @return имя сотрудника
     */
    public String getName() {
        return name;
    }
    
    /**
     * Метод, определяющий уровень сотрудника
     * @param level уровень служащего
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    
    /**
     * Метод, который получает уровень сотрудника
     * @return уровень сотрудника
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Метод, который получает отдел сотрудника
     * @return отдел сотрудника
     */
    public String getDept() {
        return dept;
    }
    
    /**
     * Метод, определяющий отдел сотрудника
     * @param dept отдел сотрудника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * Метод, определяющий имя сотрудника
     * @param name имя сотрудника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}