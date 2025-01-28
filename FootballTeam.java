import java.util.Random;

public class FootballTeam {
    private int[] heights;

    public FootballTeam() {
        this.heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
        }
    }

    public int findSum() {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public double findMean() {
        return (double) findSum() / heights.length;
    }

    public int findShortest() {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public int findTallest() {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public void displayResults() {
        System.out.println("Heights of players in the football team:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        System.out.println("\nStatistics:");
        System.out.println("Sum of heights: " + findSum() + " cm");
        System.out.println("Mean height: " + findMean() + " cm");
        System.out.println("Shortest height: " + findShortest() + " cm");
        System.out.println("Tallest height: " + findTallest() + " cm");
    }

    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        team.displayResults();
    }
}