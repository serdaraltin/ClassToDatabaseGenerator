package Interface;

import java.util.ArrayList;
import javax.swing.JTable;

public interface Interface_Controller<T> {

    public boolean Control(T data);

    public boolean Add(T data);

    public boolean Update(T data);

    public boolean Delete(T data);

    public T Get(T data);

    public void List(JTable table);

    public int GetId(T data);

    public void GetList(JTable table);
    
    public ArrayList<String[]> GetArrayList();
    
    public void Check(T data);
}
