package domain;

/**
 * Подкласс Artist, представляющий редактора
 * @see Artist
 * @author Jekaprio
 */
public class Editor extends Artist {
    
    /**
     * Конструктор, который инициализирует новый объект
     * @param electronicEditing статус электронного редактирования
     * @param skiils навыки редактора
     * @param name имя редактора
     * @param jobTitle должность редактора
     * @param level уровень редактора
     * @param dept отдел редакции
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Создает новый объект с электронным редактированием параметров и навыками
     * @param electronicEditing статус электронного редактирования
     * @param skiils навыки редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Создает новый объект с электронным редактированием параметров
     * @param electronicEditing статус электронного редактирования
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Создает новый объект и включается электронное редактирование
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /**
     * Преобразование информации о человеке с информацией о навыках и статусе электронного редактирования в строку
     * @return строка с информацией о человеке
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Метод, который получает статус электронного редактирования
     * @return логическое значение электронного редактирования
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Метод, определяющий статус электронного редактирования
     * @param electronic статус электронного редактирования
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}