package flu1;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public static final Double CREATURE_RATE = 0.2;

    private Integer width;
    private Integer height;
    private Neighbourhood neighbourhood;
    private List<List<Chunk>> chunks;

    public Map(Integer width, Integer height, Neighbourhood neighbourhood) {
        this.width = width;
        this.height = height;
        this.neighbourhood = neighbourhood;
        this.chunks = new ArrayList<>();

        for (int y = 0; y < height; y++) {
            List<Chunk> list = new ArrayList<>();
            for (int x = 0; x < width; x++) {
                list.add(new Chunk(x, y));
            }
            chunks.add(list);
        }
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public List<List<Chunk>> getChunks() {
        return chunks;
    }

    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                sb.append(chunks.get(y).get(x));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}

