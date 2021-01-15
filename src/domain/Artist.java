package domain;

/**
 * Подкласс Employee, представляющий художника
 * @see Employee
 * @author Jekaprio
 */
public class Artist extends Employee {
    
    /**
     * Конструктор, который инициализирует новый объект
     * @param skiils навыки художника
     * @param name имя художника
     * @param jobTitle должность художника
     * @param level уровень художника
     * @param dept отдел художника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    /**
     * Создает новый объект с параметрами навыков
     * @param skiils навыки художника 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Создает новый объект
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    
    /**
     * Преобразование информации об исполнителе в строку
     * @return строка с информацией об исполнителе
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**
     * Метод, который приобретает навыки художника в струне
     * @return навыки художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Метод, определяющий навыки художника
     * @param skills навыки художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Метод получения списка навыков художника
     * @return список навыков
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}