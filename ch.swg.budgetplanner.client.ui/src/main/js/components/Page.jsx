import React from "react";
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';

/**
 * Placeholder in the layout to load different pages into.
 */
export default class Page extends React.Component {
  render() {
    return (
      <Box component="main" sx={{ flexGrow: 1, p: 3 }}>
        <Toolbar />
        <div id="page"></div>
      </Box>
    );
  }
}