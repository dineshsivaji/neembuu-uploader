/*
 * Copyright (C) 2015 Shashank Tulsyan <shashaank at neembuu.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package neembuu.uploader.cmd;

import neembuu.uploader.external.PluginDestructionListener;

/**
 *
 * @author Shashank Tulsyan <shashaank at neembuu.com>
 */
public class DummyPluginDestructionListener implements PluginDestructionListener{
    public static DummyPluginDestructionListener make(String a){
        return new DummyPluginDestructionListener(a);
    }
    String a;
    public DummyPluginDestructionListener(String a){
        this.a =a ;
    }
    @Override
    public void destroyed() throws Exception {
        System.out.println("plugin destroyed "+a);
    }
    
}
