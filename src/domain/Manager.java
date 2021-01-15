package domain;

/**
 * Подкласс Employee, представляющий менеджера
 * @see Employee
 * @author Jekaprio
 */
public class Manager extends Employee {

    /**
     * Конструктор, который инициализирует новый объект
     * @param employees сотрудники
     * @param name имя сотрудника
     * @param jobTitle должность сотрудника
     * @param level уровень сотрудника
     * @param dept отдел сотрудника
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    
    /**
     * Преобразование информации о сотрудниках в строку
     * @return строка информации о сотрудниках
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Создает новый объект с параметром
     * @param employees сотрудники менеджера
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Создает новый объект
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * Метод, который получает имена сотрудников
     * @return имена сотрудников
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод, определяющий сотрудников менеджера
     * @param employees сотрудники менеджера
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Метод, который получает список сотрудников
     * @return множество сотрудников
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}