package info.fulloo.trygve.editor;

/*
 * Trygve IDE 1.1 1.1
 *   Copyright (c)2015 James O. Coplien
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  For further information about the trygve project, please contact
 *  Jim Coplien at jcoplien@gmail.com
 *
 */

public class Main {

	public static void main(String[] args) {
		// We adopt a Windows-like line formatting, uniformly, as a way
		// to get platform independence in the output. Many thanks to
		// Egon Elbre!
		System.setProperty("line.separator", "\n");
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TextEditorGUI().setVisible(true);
			}
		});
	}
}