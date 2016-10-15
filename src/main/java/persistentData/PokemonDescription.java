package persistentData;

import java.util.HashMap;

public class PokemonDescription {
	private HashMap<String, String> keyValueDesc;
	public PokemonDescription() {
		keyValueDesc = new HashMap<String, String>();
		keyValueDesc.put("none", "Missing pokemon name");
		keyValueDesc.put("error", "Invalid pokemon name");
		keyValueDesc.put("bulbasaur", "È possibile vedere Bulbasàur mentre schiaccia un pisolino sotto il sole. Ha un seme piantato sulla schiena. Grazie ai raggi solari, il seme crescie, ingrandendosi progressivamente.");
		keyValueDesc.put("ivysaur", "C'è un germoglio piantato nella schiena di Ivysàur. Per sopportarne il peso, le zampe e il corpo crescono robusti. Quando inizia a passare più tempo esposto al sole, signìfica che il germoglio sboccerà présto in un grande fiore.\nC'è un grande fiore sulla schiena di Venusàur. Si dice che i colori diventino più vìvidi con il giusto nutrimento e i raggi solari. Il suo profumo calma le reazioni emotive delle persone.");
	}
	
	public HashMap<String, String> getKeyValueDesc() {
		return keyValueDesc;
	}
	public void setKeyValueDesc(HashMap<String, String> keyValueDesc) {
		this.keyValueDesc = keyValueDesc;
	}
	
	public Pokemon getPokemon(String nPokemon){
		String desc = keyValueDesc.get(nPokemon.toLowerCase());
		desc = (desc == null ? keyValueDesc.get("error") : desc);
		return new Pokemon(nPokemon, desc);
	}
	
}
