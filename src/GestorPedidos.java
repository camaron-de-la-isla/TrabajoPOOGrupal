import java.util.ArrayList;

public class GestorPedidos {
    private ArrayList<Venta> pedidoList;

    public GestorPedidos() {
        pedidoList = new ArrayList<>();
    }

    public void addPedido(Venta pedido) {
        pedidoList.add(pedido);
    }

    public ArrayList<Venta> obtenerPedidos() {
        return pedidoList;
    }

    public void removePedido(Venta pedido) {
        pedidoList.remove(pedido);
    }

    public void actualizarPedido(Venta pedido) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == pedido.getId()) {
                pedidoList.set(i, pedido);
            }
        }
    }


    public void buscarPedido(String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getNombre().equals(nombre)) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

    public void buscarPedido(int id) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

public void buscarPedido(int id, String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id && pedidoList.get(i).getNombre().equals(nombre)) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

}
