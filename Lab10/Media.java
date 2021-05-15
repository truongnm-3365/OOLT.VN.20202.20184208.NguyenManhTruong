package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.Aims.AimsGui;

import javax.swing.*;

public  class Media implements Comparable<Object> {
    
    private String title;
    private String category;
    private float cost;
    private int id;

    public int getId() {
        return id;
    }

    public Media(int id) {
        this.id = id;
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public Media(String title, String category,float cost) {
        this.title = title;
        this.category =category;
        this.cost = cost;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.id = id;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }


    public String getCategory() {
        return category;
    }


    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object o) throws NullPointerException,ClassCastException{
        if (o instanceof Media) {
            Media another = (Media) o;
            if(another!=null){
                if (this.id == another.id)
                    return true;
            }else{
                JOptionPane.showMessageDialog(null,"Error","Null Pointer Exception",JOptionPane.ERROR_MESSAGE);
                throw new NullPointerException();
            }

        }else{
            JOptionPane.showMessageDialog(null,"Error","Class Cast Exception",JOptionPane.ERROR_MESSAGE);
            throw new ClassCastException();
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
            if (o instanceof Media) {
                Media another = (Media) o;
                if(another != null)
                return this.getTitle().compareTo(another.getTitle());
                else{
                    JOptionPane.showMessageDialog(null,"Error","Null Pointer Exception",JOptionPane.ERROR_MESSAGE);
                    throw new NullPointerException();
                }

            }
            else{
                JOptionPane.showMessageDialog(null,"Error","Class Cast Exception",JOptionPane.ERROR_MESSAGE);
                throw new ClassCastException();
            }
    }
}
