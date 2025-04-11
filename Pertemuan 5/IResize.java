public interface IResize {
    public void zoomIN();
    public void zoomOut();
    public void zoom(int percent);
}

/*  Keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
    dibanding dijadikan sebagai abstract method dalam class BangunDatar adalah method-
    method tersebut dapat diimplementasikan oleh class manapun, tidak terbatas harus
    menjadi subclass dari BangunDatar.  */
