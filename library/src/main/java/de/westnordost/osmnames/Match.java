package de.westnordost.osmnames;

import java.util.Map;

/** A dictionary entry, linking name and terms with tags */
public class Match
{
	public final String name;
	public final Map<String, String> tags;
	public final String parentName;

	public Match(String name, Map<String,String> tags, String parentName)
	{
		this.name = name;
		this.tags = tags;
		this.parentName = parentName;
	}
}
