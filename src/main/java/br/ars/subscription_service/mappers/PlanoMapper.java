package br.ars.subscription_service.mappers;

import org.mapstruct.Mapper;

import br.ars.subscription_service.dto.PlanoDTO;
import br.ars.subscription_service.models.PlanoAssinatura;


@Mapper(componentModel = "spring")
public interface PlanoMapper {
    PlanoDTO toDTO(PlanoAssinatura plano);
    PlanoAssinatura toEntity(PlanoDTO dto);
}
