package com.phataphat.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

@Component
public class ConversionUtils {
	@Autowired
	private ModelMapper modelMapper;

	private static final Logger logger = LoggerFactory.getLogger(ConversionUtils.class);

	public <D, S> D convertToEntity(S source, Class<D> destClasss) {
		logger.debug("=> In ConversionUtil.convertToEntity()");
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		D dest = null;
		if (source != null) {
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			dest = modelMapper.map(source, destClasss);
		}
		return dest;
	}

	public static <D, S> D convertToDTO(S source, Class<D> destClasss, ModelMapper modelMapper) {
		logger.debug("=> In ConversionUtil.convertToDTO()");
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		D dest = null;
		if (source != null) {
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			dest = modelMapper.map(source, destClasss);
		}
		return dest;
	}

	public <D, S> List<D> convertToEntity(List<S> source, Class<D> destClass) {
		logger.debug("=> In ConversionUtil.convertToEntityList()");
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<D> desti = null;
		if (source != null) {
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			desti = source.stream().map(dto -> (D) convertToEntity(dto, destClass)).collect(Collectors.toList());
		}
		return desti;
	}

	public static <D, S> List<D> convertToDTOs(List<S> source, Class<D> dest, ModelMapper modelMapper) {
		logger.debug("=> In ConversionUtil.convertToDTOList()");
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<D> desti = null;
		if (source != null) {
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			desti = source.stream().map(entity -> (D) convertToDTO(entity, dest, modelMapper))
					.collect(Collectors.toList());
		}
		return desti;
	}

	public static <D, S> Page<D> convertToDTOPage(Page<S> sourcePage, Class<D> destination, ModelMapper modelMapper) {
		Page<D> destPage = null;
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		if (sourcePage != null) {
			modelMapper.getConfiguration().setAmbiguityIgnored(true);
			List<D> collect = sourcePage.getContent().stream().map(dto -> (D) convertToDTO(dto, destination, modelMapper)).collect(Collectors.toList());
			destPage = new PageImpl<>(collect);
		}
		return destPage;
	}
}
