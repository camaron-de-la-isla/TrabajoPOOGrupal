import java.util.ArrayList;
import java.util.List;

public class GestorStock {
    private List<Stock> stockList;

    public GestorStock() {
        stockList = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stockList.add(stock);
    }

    public List<Stock> obtenerStock() {
        return stockList;
    }

    public void removeStock(Stock stock) {
        stockList.remove(stock);
    }

    public void actualizarStock(Stock stock) {
        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i).getId() == stock.getId()) {
                stockList.set(i, stock);
            }
        }
    }

    public void buscarStock(String nombre) {
        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i).getNombre().equals(nombre)) {
                System.out.println(stockList.get(i));
            }
        }
    }

    public void buscarStock(int id) {
        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i).getId() == id) {
                System.out.println(stockList.get(i));
            }
        }
    }

    public void buscarStock(String nombre, int id) {
        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i).getId() == id && stockList.get(i).getNombre().equals(nombre)) {
                System.out.println(stockList.get(i));
            }
        }
    }
}
