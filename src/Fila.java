public class Fila {
    private static Fila _fila;
    private Fila(){
    }
    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }
    public static Fila getInstance(){
        if(_fila==null){
            _fila= new Fila();
        }
        return _fila;
    }
}