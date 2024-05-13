package com.vepilef.lanchesLegal.infra.swagger;

public final class ProdutoResponseSwagger {
    public static final String POST = "{ \r\n"
            + "  \"categoria\": \"LANCHE\",\r\n"
            + "  \"nome\": \"X-Tudo\",\r\n"
            + "  \"descricao\": \"pão, 2 carnes, queijo, presunto, bacon, ovo, alface, tomate, milho e batata.\",\r\n"
            + "  \"preco\": 19.32,\r\n"
            + "  \"tempoPreparo\": 35,\r\n"
            + "}";

    public static final String PUT = "{ \r\n"
            + "  \"categoria\": \"LANCHE\",\r\n"
            + "  \"nome\": \"X-Tudo\",\r\n"
            + "  \"descricao\": \"pão, 2 carnes, queijo, presunto, bacon, ovo, alface, tomate, milho e batata.\",\r\n"
            + "  \"preco\": 19.99,\r\n"
            + "  \"tempoPreparo\": 35\r\n"
            + "}";

    public static final String UPDATED = "{\r\n"
            + "    \"idProduto\": 8,\r\n"
            + "    \"categoria\": \"LANCHE\",\r\n"
            + "    \"nome\": \"X-Tudo\",\r\n"
            + "    \"descricao\": \"pão, 2 carnes, queijo, presunto, bacon, ovo, alface, tomate, milho e batata.\",\r\n"
            + "    \"preco\": 19.99,\r\n"
            + "    \"tempoPreparo\": 35\r\n"
            + "}";

    public static final String CREATED = "{\r\n"
            + "    \"idProduto\": 8,\r\n"
            + "    \"categoria\": \"LANCHE\",\r\n"
            + "    \"nome\": \"X-Tudo\",\r\n"
            + "    \"descricao\": \"pão, 2 carnes, queijo, presunto, bacon, ovo, alface, tomate, milho e batata.\",\r\n"
            + "    \"preco\": 19.32,\r\n"
            + "    \"tempoPreparo\": 35,\r\n"
            + "}";

    public static final String BADREQUEST = "[\r\n"
            + "    {\r\n"
            + "        \"campo\": \"categoria\",\r\n"
            + "        \"mensagem\": \"não deve ser nulo\"\r\n"
            + "    }\r\n"
            + "]";

    public static final String BADREQUESTVINCULADOPEDIDO = "[\r\n"
            + "    {\r\n"
            + "        \"campo\": \"Exclusão\",\r\n"
            + "        \"mensagem\": \"Este registro está vinculado a outro, não pode ser excluído!\"\r\n"
            + "    }\r\n"
            + "]";
}
