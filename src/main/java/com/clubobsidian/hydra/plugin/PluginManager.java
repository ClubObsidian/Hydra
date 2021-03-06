/*
   Copyright 2018 Club Obsidian and contributors.

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
package com.clubobsidian.hydra.plugin;

import java.io.File;
import java.util.List;

import com.clubobsidian.trident.Event;
import com.clubobsidian.trident.Listener;

public interface PluginManager {

	public List<HydraPlugin> getLoadedPlugins();
	
	public void callEvent(Event event);
	
	public void registerEvents(Listener listener, HydraPlugin plugin);
	
	public void unregisterEvents(Listener listener, HydraPlugin plugin);
	
	public void enablePlugin(HydraPlugin plugin);
	
	public void enablePlugin(File file);
	
	public void disablePlugin(HydraPlugin plugin);	
	
	public void enablePlugins();
	
	public void disablePlugins();
	
}