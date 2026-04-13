class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        boolean change = true;

        while(change){
            change = false;

            for(int i = 0; i < asteroids.length - 1; i++){
                if(asteroids[i] > 0 && asteroids[i + 1] < 0){
                    if(Math.abs(asteroids[i]) > Math.abs(asteroids[i+1])){
                        asteroids[i+1] = 0;
                    } else if (Math.abs(asteroids[i]) < Math.abs(asteroids[i+1])){
                        asteroids[i] = 0;
                    } else {asteroids[i] = 0;
                    asteroids[i+1] = 0;
                    }
                    change = true;
            }
        }
         List<Integer> List = new ArrayList<>();
    for (int k : asteroids){
        if(k != 0) List.add(k);
    }

    asteroids = new int[List.size()];
    for (int k = 0; k < List.size(); k++){
        asteroids[k] = List.get(k);
    }
    }
    return asteroids;
}
}