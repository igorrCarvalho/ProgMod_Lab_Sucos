public enum ETamanho {
    PEQUENO(1.0),
    MEDIO(1.4),
    GRANDE(1.6);

    private double taxa;
    ETamanho(double taxa) {
        this.taxa = taxa;
    }

    public double taxa() {
        return taxa;
    }
}
