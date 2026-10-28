void main() {
    double valorTotal = 50.25;
    int idadeCliente = 60;
    double descontoIdoso = 15.0 / 100.0;
    double descontoNormal = 10.0 / 100.0;

    if (valorTotal <= 0) {
        System.out.println("Valor de compra inválido.");
    }
    else if (idadeCliente >= 60) {
        System.out.println(valorTotal- (descontoIdoso * valorTotal));
    }
    else if(idadeCliente <= 60 && valorTotal >= 200){
        System.out.println(valorTotal- (descontoNormal * valorTotal));
    }
    else{
        System.out.println(valorTotal);
    }

}