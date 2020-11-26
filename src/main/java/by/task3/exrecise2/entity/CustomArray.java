package by.task3.exrecise2.entity;

import java.io.Serializable;
import java.util.Arrays;

public class CustomArray implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int[][] jaggedArray;
    
    public CustomArray() {}

    public CustomArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return jaggedArray;
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(jaggedArray);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomArray other = (CustomArray) obj;
        if (!Arrays.deepEquals(jaggedArray, other.jaggedArray))
            return false;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getName());
        builder.append(" [jaggedArray=");
        builder.append(Arrays.toString(jaggedArray));
        builder.append("]");
        return builder.toString();
    }
}
