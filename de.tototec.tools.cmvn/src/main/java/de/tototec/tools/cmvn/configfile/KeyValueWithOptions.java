package de.tototec.tools.cmvn.configfile;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class KeyValueWithOptions extends KeyValue {
	private final List<KeyValue> options;

	public KeyValueWithOptions(final String key, final String value,
			final List<KeyValue> options) {
		super(key, value);
		this.options = options;
	}

	public KeyValueWithOptions(final String key, final String value,
			final String optionSeparator, final String keyValueSeparator,
			final String defaultValue) {
		super(key, value.split(optionSeparator)[0].trim());

		final StringSplitter splitter = new StringSplitter();

		options = new LinkedList<KeyValue>();

		final String[] split = splitter.split(value, optionSeparator, "\\");
		if (split.length > 1) {
			for (int i = 1; i < split.length; ++i) {
				final String option[] = splitter.split(split[i],
						keyValueSeparator, "\\", 2);
				final String oValue = option.length == 1 ? defaultValue
						: option[1].trim();
				options.add(new KeyValue(option[0].trim(), oValue));
			}
		}
	}

	public KeyValueWithOptions(final KeyValue keyValue,
			final String optionSeparator, final String keyValueSeparator,
			final String defaultValue) {
		this(keyValue.getKey(), keyValue.getValue(), optionSeparator,
				keyValueSeparator, defaultValue);
		setFile(keyValue.getFile());
		setLine(keyValue.getLine());
	}

}
