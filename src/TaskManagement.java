import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskManagement
{
    public static void main(String[] args)
    {
        Queue<Task> taskQueue = new LinkedList<Task>();
        Stack<Task> completedTasks = new Stack<>();

        // Adding tasks to the queue
        taskQueue.offer(new Task("Task 1", 1000));
        taskQueue.offer(new Task("Task 2", 1500));
        taskQueue.offer(new Task("Task 3", 1100));
        while (!taskQueue.isEmpty())
        {
            Task currentTask = taskQueue.poll();
            System.out.println("Processing task: " + currentTask.getDescription());
            currentTask.processTask();
            System.out.println("Completed task: " + currentTask.getDescription());
            completedTasks.push(currentTask);
        }
        //Displaying the tasks in stack
        System.out.println("Completed tasks:");
        while (!completedTasks.isEmpty()) {
            System.out.println(completedTasks.pop());
        }
    }
}

