package henriet.clement.recyclerview;

public class ListItem
{
    
    private String head, description;
    
    public ListItem(String head, String description)
    {
        this.head = head;
        this.description = description;
    }
    
    public String getHead()
    {
        return head;
    }
    
    public void setHead(String head)
    {
        this.head = head;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
}
