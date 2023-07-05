package com.msb.config;

import com.msb.anno.EnableDefineService;
import com.msb.service.CacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * description : 动态注入bean
 * @author kunlunrepo
 * date :  2023-07-04 17:23
 */
public class MyDefineImportSelector implements ImportSelector {

	private final String PAGE_ATTR_NAME = "packages";

	private static final Logger log = LoggerFactory.getLogger(MyDefineImportSelector.class);

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		// 获取指定注解的详细信息，根据注解中配置的属性来返回不同的class
		List<String> packages = new ArrayList<>();
		MultiValueMap<String, Object> annoAttrs = annotationMetadata.getAllAnnotationAttributes(EnableDefineService.class.getName(), true);
		for (Map.Entry<String, List<Object>> entry : annoAttrs.entrySet()) {
			String k = entry.getKey();
			List<Object> v = entry.getValue();
			// 获取指定key对应的值
			if (PAGE_ATTR_NAME.equals(k)) {
				if (null != v && v.size() > 0) {
					// 遍历指定key的多个值
					for (int i = 0; i < v.size(); i++) { // 多个值
						if (null != v.get(i) && v.get(i).getClass().isArray()) {
							String[] tempArray = (String[]) v.get(i);
							// 遍历指定key的值为集合的
							for (int j = 0; j < tempArray.length; j++) { // 值多个
								if (null != tempArray[j] && !"".equals(tempArray[j])){
									packages.add(tempArray[j]);
								}
							}

						}
					}
				}
			}
			log.debug("【注解】-[EnableDefineService] 注解类：{} 属性名:{},属性值:{}", annotationMetadata.getClassName(), k, String.valueOf(v));
		}

		// 处理返回值
		String[] result = new String[] {};
		if (!packages.isEmpty()) {
			result = packages.toArray(new String[packages.size()]);
		}
		return result;
	}
}
