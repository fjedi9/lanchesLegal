package com.vepilef.lanchesLegal.adapter.message.produto;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEvent {
    private EventoEnum evento;
    private ProdutoDto produtoDto;
}
