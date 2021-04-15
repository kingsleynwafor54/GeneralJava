package Turtle;

public class Position {
    private int rowpPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowpPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        String toString = "Position\n";
        toString += "Current Row Position:" + rowpPosition;
        toString += "\nCurrent column Position :" + columnPosition;
        return toString;
    }

    //    @Override
//    public boolean equals(Object obj){
//        if (this.columnPosition==obj.columnPosition)
//            return super.equals(obj);
//
//    }
    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }

    @Override
    public boolean equals(Object anotherPosition) {
        if (anotherPosition.getClass() != this.getClass()) {
            return false;
        }

        Position convertedPosition = (Position) anotherPosition;
        boolean columnsAreEqual=convertedPosition.columnPosition==this.columnPosition;
        boolean rowsAreEqual=convertedPosition.rowpPosition==this.rowpPosition;
        return  columnsAreEqual &&rowsAreEqual;
    }
}