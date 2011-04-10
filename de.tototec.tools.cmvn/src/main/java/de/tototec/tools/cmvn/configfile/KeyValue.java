package de.tototec.tools.cmvn.configfile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class KeyValue {
	private final String key;
	private final String value;
	private String file;
	private Integer line;
}
