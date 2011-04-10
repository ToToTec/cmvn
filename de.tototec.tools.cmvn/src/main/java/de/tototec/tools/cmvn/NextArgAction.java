package de.tototec.tools.cmvn;

/**
 * Single argument processor that can provide its successor (for the next
 * argument).
 */
public interface NextArgAction {
	NextArgAction processArg(String arg);
}