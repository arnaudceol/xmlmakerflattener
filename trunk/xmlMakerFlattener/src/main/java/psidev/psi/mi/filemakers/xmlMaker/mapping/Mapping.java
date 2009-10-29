/*  Copyright 2004 Arnaud CEOL

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.

 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package psidev.psi.mi.filemakers.xmlMaker.mapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * The bean that can keep the mapping information.
 * 
 * @author Arnaud Ceol, University of Rome "Tor Vergata", Mint group,
 *         arnaud.ceol@gmail.com
 *  
 */
public class Mapping {

	public ArrayList<DictionaryMapping> getDictionaries() {
		return dictionaries;
	}

	public Date date;

	public ArrayList<FlatFileMapping> getFlatFiles() {
		return flatFiles;
	}

	public void setFlatFiles(ArrayList<FlatFileMapping> flatFiles) {
		this.flatFiles = flatFiles;
	}

	public TreeMapping tree;

	public ArrayList<DictionaryMapping> dictionaries = new ArrayList<DictionaryMapping>();

	public ArrayList<FlatFileMapping> flatFiles = new ArrayList<FlatFileMapping>();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TreeMapping getTree() {
		return tree;
	}

	public void setTree(TreeMapping tree) {
		this.tree = tree;
	}

	public void setDictionaries(ArrayList<DictionaryMapping> dictionaries) {
		this.dictionaries = dictionaries;
	}

}