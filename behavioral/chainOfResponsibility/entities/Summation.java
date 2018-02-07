package behavioral.chainOfResponsibility.entities;

import behavioral.chainOfResponsibility.enums.Operation;

public class Summation implements ChainItem {

    private ChainItem nextItem;

    public Summation() {
    }

    @Override
    public void setNextIdem(ChainItem item) {
        this.nextItem = item;
    }

    @Override
    public void execute(Task task) {
        if (task.getOperation().equals(Operation.SUM)) {
            System.out.printf("%d + %d = %d\n",
                    task.getNum1(),
                    task.getNum2(),
                    task.getNum1() + task.getNum2());
        } else {
            this.nextItem.execute(task);
        }
    }
}
