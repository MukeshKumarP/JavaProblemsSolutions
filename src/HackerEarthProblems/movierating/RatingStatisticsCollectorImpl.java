package HackerEarthProblems.movierating;

import java.util.*;

public class RatingStatisticsCollectorImpl implements RatingStatisticsCollector{

    HashMap<String, List<Integer>> map = new HashMap<>();

    @Override
    public void putNewRating(String app, int rating) {
        if(map.containsKey(app)){
            map.get(app).add(rating);
        }else {
            map.put(app,new ArrayList());
            map.get(app).add(rating);
        }
    }

    @Override
    public double getAverageRating(String app) {
        int sum=0;
        if(map.containsKey(app)){
            List<Integer> list = map.get(app);
            for (int i:list) {
                sum+=i;
            }
            return sum/ list.size();
        }
        return 0;
    }

    @Override
    public int getRatingsCount(String app) {
        if(map.containsKey(app)) {
            return map.get(app).size();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }

            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }

}
