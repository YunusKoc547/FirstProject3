package replpractice;

public class MethodsWithReturn8ValidateTask_175 {

    public boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        if (notEmpty == true && (currentId +1) == taskId) {
            return true;
        }else {
            return false;
        }


    }
}
